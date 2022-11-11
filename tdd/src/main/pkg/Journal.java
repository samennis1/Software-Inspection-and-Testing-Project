package pkg;

import java.util.ArrayList;

public class Journal {
    private boolean subscriptionStatus;
    private String name;
    private String subject;
    private String department;
    private boolean available = true;
    private int minimumWithdrawals;
    private boolean externalAccess;
    private ArrayList<String> previousOwners = new ArrayList<>();

    public Journal(String name) {
        this.name = name;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSubscriptionStatus(boolean subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    public boolean isSubscriptionStatus() {
        return subscriptionStatus;
    }

    public String getName() {
        return name;
    }

    public void setExternalAccess(boolean a) {
        externalAccess = a;
    }

    public boolean isExternalAccess() {
        return externalAccess;
    }


    public int getMinimumWithdrawals() {
        return minimumWithdrawals;
    }

    public boolean cancelSubscription(int withdrawals) {
        if (withdrawals >= getMinimumWithdrawals() || isExternalAccess() == true) {
            setSubscriptionStatus(true);
            return false;
        } else {
            setSubscriptionStatus(false);
            return true;
        }
    }

    public void setMinimumWithdrawals(int i) {
        minimumWithdrawals = i;
    }
}
