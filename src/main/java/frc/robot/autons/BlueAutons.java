package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.DriveDistance;
import frc.robot.commands.DriveTurn;
import frc.robot.subsystems.Drivetrain;
import frc.robot.enums.QUADRANT;

public class BlueAutons extends SequentialCommandGroup {
    private Drivetrain drivetrain;

    private void registerBlueCurve() {
        addCommands(
            new DriveDistance(1, 9, drivetrain),
            new DriveTurn(1, 90, 0, drivetrain),
            new DriveDistance(1, 13.73, drivetrain),
            new DriveTurn(1, 90, 0, drivetrain),
            new DriveDistance(1, 10.5, drivetrain),
            new DriveTurn(1, -90, 0, drivetrain),
            new DriveDistance(1, 12.6, drivetrain),
            new DriveTurn(1, -90, 0, drivetrain),
            new DriveDistance(1, 8, drivetrain),
            new DriveTurn(1, 90, 0, drivetrain),
            new DriveTurn(1, 26.3, 9.62, drivetrain)
        );
    }

    private void registerBlueTriangle() {

    }

    public BlueAutons(Drivetrain drivetrain, QUADRANT quadrant) {
        this.drivetrain = drivetrain;
        if (quadrant == QUADRANT.CURVE) {
            registerBlueCurve();
        } else if (quadrant == QUADRANT.TRIANGLE) {
            registerBlueTriangle();
        }
    }
}