package frc.robot.autons.BlueAutons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.enums.QUADRANT;
import frc.robot.subsystems.Drivetrain;

public class BlueAutonFactory extends SequentialCommandGroup {
    public BlueAutonFactory(Drivetrain drivetrain, QUADRANT quadrant) {
        if (quadrant == QUADRANT.CURVE) {
            new BlueCurveAuton(drivetrain);
        } else if (quadrant == QUADRANT.TRIANGLE) {
            new BlueTriangleAuton(drivetrain);
        }
    }

}