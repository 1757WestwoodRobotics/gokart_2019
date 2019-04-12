package whsrobotics.commands;

import edu.wpi.first.wpilibj.command.Command;
import whsrobotics.robot.OI;
import whsrobotics.robot.Robot;

public class Drive extends Command {

  public Drive() {
    requires(Robot.drivetrain);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.drivetrain.arcadeDrive(OI.getXboxController().getX(), OI.getXboxController().getY());
  }

  @Override
  protected boolean isFinished() {
    return false;
  }
}
