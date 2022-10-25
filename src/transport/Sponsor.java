package transport;

public class Sponsor {
    private String name;
    private int contributionAmount;

    public Sponsor(String name, int contributionAmount) {
        this.name = name;
        this.contributionAmount = contributionAmount;
    }

    private void sponsorTheRace() {
        System.out.println("Спонсор " + name + " для поддержки заезда, внес " + contributionAmount + " рублей.");
    }

    public String getName() {
        return name;
    }

    public int getContributionAmount() {
        return contributionAmount;
    }

    @Override
    public String toString() {
        return "Спонсор " + name +
                " для поддержки заезда, внес " + contributionAmount + " рублей.";
    }
}
