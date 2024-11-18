package com.play.kc.ui

import android.hardware.Sensor

enum class VendorSensor(
    val title: String,
    val type: Int,
    val length: Int
) {
    NONE("None", 0, 0),
    ACCELEROMETER("Accelerometer", Sensor.TYPE_ACCELEROMETER, 3),
    GYROSCOPE("Gyroscope", Sensor.TYPE_GYROSCOPE, 3),
    PRESSURE("Pressure", Sensor.TYPE_PRESSURE, 1),
    TEMPERATURE("Temperature", Sensor.TYPE_AMBIENT_TEMPERATURE, 1),
    STEP("Step", Sensor.TYPE_STEP_COUNTER, 1),
    HR("Heart Rate", Sensor.TYPE_HEART_RATE, 1),
    OXYGEN_SATURATION("OXYGEN_SATURATION", Sensor.TYPE_DEVICE_PRIVATE_BASE + 10, 1),
    ECG("ECG", Sensor.TYPE_DEVICE_PRIVATE_BASE + 11, 1),
    HEART_RATE_RAW("HEART_RATE_RAW", Sensor.TYPE_DEVICE_PRIVATE_BASE + 12, 4),
    OXYGEN_SATURATION_RAW("OXYGEN_SATURATION_RAW", Sensor.TYPE_DEVICE_PRIVATE_BASE + 13, 8),
    ECG_RAW("ECG_RAW", Sensor.TYPE_DEVICE_PRIVATE_BASE + 14, 1)
}
