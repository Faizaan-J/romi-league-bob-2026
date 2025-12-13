package frc.robot.autons.BlueAutons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.DriveDistance;
import frc.robot.commands.DriveTurn;
import frc.robot.subsystems.Drivetrain;

public class BlueCurveAuton extends SequentialCommandGroup {
    public BlueCurveAuton(Drivetrain drivetrain) {
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
}