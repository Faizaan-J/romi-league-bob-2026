package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;

import frc.robot.enums.ALLIANCE;
import frc.robot.enums.QUADRANT;

import frc.robot.autons.BlueAutons.BlueAutonFactory;
import frc.robot.autons.RedAutons.RedAutonFactory;

public class MasterAutonFactory extends SequentialCommandGroup {
    public MasterAutonFactory(Drivetrain drivetrain, ALLIANCE alliance, QUADRANT quadrant) {
        if (alliance == ALLIANCE.RED) {
            new RedAutonFactory(drivetrain, quadrant);
        } else if (alliance == ALLIANCE.BLUE) {
            new BlueAutonFactory(drivetrain, quadrant);
        }
    }
}
