package whsrobotics.robot;

public class RobotMap {
  public enum Controllers {
    MAIN_XBOX(0);

    public int port;

    Controllers(int port) {
      this.port = port;
    }
  }
  public enum CANDevice {
    LEFT_BACK(1), LEFT_CENTER(2), LEFT_FRONT(3),
    RIGHT_BACK(4), RIGHT_CENTER(5), RIGHT_FRONT(6);

    public int id;

    CANDevice(int id) {
      this.id = id;
    }
  }
}
