public interface LeaveApprover {
    void setNextApprover(LeaveApprover nextApprover);
    void approveLeave(LeaveRequest leaveRequest);
}