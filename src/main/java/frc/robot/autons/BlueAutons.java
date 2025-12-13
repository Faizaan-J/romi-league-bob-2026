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
            new DriveDistance(1, 2, drivetrain),
            new DriveTurn(0.5, -90, 0, drivetrain),
            new DriveDistance(1, 6.73, drivetrain),
            new DriveTurn(1, -90, 0, drivetrain),
            new DriveDistance(1, 4.5, drivetrain),
            new DriveTurn(1, 90, 0, drivetrain),
            new DriveDistance(1, 6.6, drivetrain),
            new DriveTurn(1, 90, 0, drivetrain),
            new DriveDistance(1, 2, drivetrain),
            new DriveTurn(1, -90, 0, drivetrain),
            new DriveTurn(1, -26.3, 6.62, drivetrain)
        );
    }

    private void registerBlueTriangle() {
        addCommands(
            new DriveDistance(1, 18.61, drivetrain),
            new DriveTurn( 1, 90, 0, drivetrain ),
            new DriveDistance(1, 10.61, drivetrain),
            new DriveTurn( 1, -90, 0, drivetrain),
            new DriveDistance(1, 19, drivetrain ),
            new DriveTurn(1, 57.3, 0, drivetrain)
        );
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