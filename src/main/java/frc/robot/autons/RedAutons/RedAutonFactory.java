package frc.robot.autons.RedAutons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.enums.QUADRANT;
import frc.robot.subsystems.Drivetrain;

public class RedAutonFactory extends SequentialCommandGroup {
    public RedAutonFactory(Drivetrain drivetrain, QUADRANT quadrant) {
        if (quadrant == QUADRANT.CURVE) {
            new RedCurveAuton(drivetrain);
        } else if (quadrant == QUADRANT.TRIANGLE) {
            new RedTriangleAuton(drivetrain);
        }
    }
 }