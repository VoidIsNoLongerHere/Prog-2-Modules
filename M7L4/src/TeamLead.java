class TeamLead implements LeaveApprover {
    private LeaveApprover nextApprover;


    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }
    public void approveLeave(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= 5) {
            System.out.println("Leave approved by Team Lead");
        } else if (nextApprover != null) {
            nextApprover.approveLeave(leaveRequest);
        } else {
            System.out.println("Leave rejected");
        }
    }
}