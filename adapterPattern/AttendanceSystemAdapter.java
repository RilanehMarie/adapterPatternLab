public class AttendanceSystemAdapter implements SchoolManagementApp {
    private final AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        if (attendanceSystem==null) {
            throw new IllegalArgumentException("Attendance System cannot be null.");
        }
        this.attendanceSystem=attendanceSystem;
    }

    @Override
    public void integrateSystem() {
        attendanceSystem.markAttendance();
    }
}
