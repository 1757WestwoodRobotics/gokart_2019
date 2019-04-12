package whsrobotics.robot;

import edu.wpi.first.wpilibj.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  public static XboxController mainXbox = new XboxController(RobotMap.Controllers.MAIN_XBOX.port);

  public static OI instance;

  public static XboxController getXboxController(){
      return mainXbox;
  }

  public static OI getInstance() {
    if (instance == null) {
        instance = new OI();
    }
    return instance;
  } 
}
