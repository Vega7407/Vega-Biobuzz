package org.firstinspires.ftc.teamcode.opmodes;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.PoseVelocity2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.MecanumDrive;

@TeleOp
public class simpleTestDrive extends OpMode {
    MecanumDrive drive;


    @Override
    public void init() {
        drive = new MecanumDrive(hardwareMap, new Pose2d(0, 0, 0));

    }

    @Override
    public void loop() {
        double x = -gamepad1.left_stick_y * 0.35;
        double y = -gamepad1.left_stick_x * 0.35;
        double turn = -gamepad1.right_stick_x * 0.35;

        drive.setDrivePowers(new PoseVelocity2d(new Vector2d(x, y), turn));
        drive.updatePoseEstimate();

        telemetry.addData("X Position", drive.localizer.getPose().position.x);
        telemetry.addData("Y Position", drive.localizer.getPose().position.y);
        telemetry.addData("Heading", drive.localizer.getPose().heading.toDouble());
        telemetry.update();
    }
}
