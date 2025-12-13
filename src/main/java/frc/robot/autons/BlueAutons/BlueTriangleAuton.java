package frc.robot.autons.BlueAutons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.DriveDistance;
import frc.robot.commands.DriveTurn;
import frc.robot.subsystems.Drivetrain;

public class BlueTriangleAuton extends SequentialCommandGroup {
    public BlueTriangleAuton(Drivetrain drivetrain) {
        addCommands( // incomplete!
            new DriveDistance(1, 18.61, drivetrain),
            new DriveTurn( 1, 90, 0, drivetrain ),
            new DriveDistance(1, 10.61, drivetrain),
            new DriveTurn( 1, -90, 0, drivetrain),
            new DriveDistance(1, 19, drivetrain ),
            new DriveTurn(1, 57.3, 0, drivetrain)
        );
    }   
}
