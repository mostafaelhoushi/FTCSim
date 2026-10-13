public class MyFIRSTJavaOpMode extends LinearOpMode {
	DcMotor motorLeft;
	DcMotor motorRight;
	DcMotor frontLeft;
	DcMotor frontRight;
	ColorSensor color1;
	DistanceSensor distance1;
	BNO055IMU imu;
	
	@Override
	public void runOpMode() {
		motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
		motorRight = hardwareMap.get(DcMotor.class, "motorRight");
		frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
		frontRight = hardwareMap.get(DcMotor.class, "frontRight");
		color1 = hardwareMap.get(ColorSensor.class, "color1");
		distance1 = hardwareMap.get(DistanceSensor.class, "distance1");
		imu = hardwareMap.get(BNO055IMU.class, "imu");
	
		// Put initialization blocks here
		waitForStart();
		// Put run blocks here
		// motorLeft.setDirection(DcMotor.Direction.REVERSE);
		motorLeft.setPower(-1);
		motorRight.setPower(0.1);
		while (opModeIsActive()) {
			// Put loop blocks here
		}
	}
	
	
}
