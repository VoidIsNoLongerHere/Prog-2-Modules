public class CEO implements LeaveApprover{
    public CEO() {
    }

    @java.lang.Override
    public void setNextApprover(LeaveApprover nextApprover) {

    }

    @java.lang.Override
    public void approveLeave(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() > 30){
            System.out.println("Leave Request Denied by CEO");
        } else{
            System.out.println("Leave Approved by CEO.");
        }
    }
}
