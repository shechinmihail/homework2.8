package transport;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Спонсор " + name +
                " для поддержки заезда, внес " + contributionAmount + " рублей.";
    }
}
