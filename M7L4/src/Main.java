import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LeaveApprover teamLead = new TeamLead();
        LeaveApprover departmentManager = new DepartmentManager();
        LeaveApprover hrManager = new HRManager();
        LeaveApprover ceo = new CEO();

        // Set up the chain of responsibility
        teamLead.setNextApprover(departmentManager);
        departmentManager.setNextApprover(hrManager);
        hrManager.setNextApprover(ceo);
        // Create a leave request - test with 4, 14 and 20 to see the results of the approval process
        ArrayList<LeaveRequest> leaveRequest = new ArrayList<>();
        leaveRequest.add(new LeaveRequest(4));
        leaveRequest.add(new LeaveRequest(9));
        leaveRequest.add(new LeaveRequest(15));
        leaveRequest.add(new LeaveRequest(30));
        leaveRequest.add(new LeaveRequest(60));

        // Send the leave request for approval
        leaveRequest.forEach(teamLead::approveLeave);

    }
}