package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.DriveDistance;
import frc.robot.commands.TurnDegrees;
import frc.robot.subsystems.Drivetrain;
import frc.robot.enums.QUADRANT;

public class BlueAutons extends SequentialCommandGroup {
    private Drivetrain drivetrain;

    private void registerRedCurve() {

    }

    private void registerRedTriangle() {
        addCommands(
            new DriveDistance(1, 6, drivetrain),
            new TurnDegrees(1, 90, drivetrain)
        );
    }

    public BlueAutons(Drivetrain drivetrain, QUADRANT quadrant) {
        this.drivetrain = drivetrain;
        if (quadrant == QUADRANT.CURVE) {
            registerRedCurve();
        } else if (quadrant == QUADRANT.TRIANGLE) {
            registerRedTriangle();
        }
    }
}