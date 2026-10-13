public class MyFIRSTJavaOpMode extends LinearOpMode {
	DcMotor motorLeft;
	DcMotor motorRight;
	DcMotor frontLeft;
	DcMotor frontRight;
	ColorSensor color1;
	DistanceSensor distance1;
	BNO055IMU imu;
	
    private void moveForward(int ms, int power){
        motorLeft.setPower(-power);
        motorRight.setPower(power);
        sleep(ms);
    }

    private void tiltRight(int ms, int power){
        motorLeft.setPower(-power);
        motorRight.setPower(-power);
        sleep(ms);
    }

    private void tiltLeft(int ms, int power){
        motorLeft.setPower(power);
        motorRight.setPower(power);
        sleep(ms);
    }

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
		moveForward(1100,1);
        tiltRight(500,1);
        moveForward(2000,1);
        tiltRight(500,1);
        moveForward(2000,1);
        tiltRight(500,1);
        moveForward(1000,1);
	}

}
