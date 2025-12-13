package frc.robot.autons.RedAutons;

import edu.wpi.first.wpilibj2.command.PrintCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.DriveDistance;
import frc.robot.subsystems.Drivetrain;

public class RedTriangleAuton extends SequentialCommandGroup {
    public RedTriangleAuton(Drivetrain drivetrain) {
        addCommands(
            new DriveDistance(0, 0, drivetrain)
        );
        new PrintCommand(getName() + " not implemented yet.");
    }
}