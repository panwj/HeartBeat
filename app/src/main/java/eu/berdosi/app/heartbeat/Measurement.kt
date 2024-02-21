package eu.berdosi.app.heartbeat

import java.util.Date

internal class Measurement<T>(@JvmField val timestamp: Date, @JvmField val measurement: T)