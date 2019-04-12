package whsrobotics.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import whsrobotics.robot.RobotMap;
import whsrobotics.commands.Drive;

public class Drivetrain extends Subsystem {
  
  public static Drivetrain instance;
  
  private static CANSparkMax leftBack;
  private static CANSparkMax leftCenter;
  private static CANSparkMax leftFront;
  private static SpeedControllerGroup leftDrive;

  private static CANSparkMax rightBack;
  private static CANSparkMax rightCenter;
  private static CANSparkMax rightFront;
  private static SpeedControllerGroup rightDrive;
  
  private static DifferentialDrive differentialDrive;

  public void init() {

    leftBack = new CANSparkMax(RobotMap.CANDevice.LEFT_BACK.id, MotorType.kBrushless);
    leftCenter = new CANSparkMax(RobotMap.CANDevice.LEFT_CENTER.id, MotorType.kBrushless);
    leftFront = new CANSparkMax(RobotMap.CANDevice.LEFT_FRONT.id, MotorType.kBrushless);
    rightBack = new CANSparkMax(RobotMap.CANDevice.RIGHT_BACK.id, MotorType.kBrushless);
    rightCenter = new CANSparkMax(RobotMap.CANDevice.RIGHT_CENTER.id, MotorType.kBrushless);
    rightFront = new CANSparkMax(RobotMap.CANDevice.RIGHT_FRONT.id, MotorType.kBrushless);
   
    leftDrive = new SpeedControllerGroup(leftBack, leftCenter, leftFront);
    rightDrive = new SpeedControllerGroup(rightBack, rightCenter, rightFront);
    
    differentialDrive = new DifferentialDrive(leftDrive, rightDrive);
    
  }

  public void arcadeDrive(double speed, double rotation) {
    differentialDrive.arcadeDrive(speed, rotation);
  }
 
  @Override
  public void initDefaultCommand() {
    // Drive
    setDefaultCommand(new Drive());
  }

  public static Drivetrain getInstance() {
    if (instance == null) {
        instance = new Drivetrain();
    }
    return instance;
  }
}
