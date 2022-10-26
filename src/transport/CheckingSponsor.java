package transport;

import java.util.HashSet;
import java.util.Set;

public class CheckingSponsor {
    private Set<Sponsor> sponsors;

    private CheckingSponsor() {
        sponsors = new HashSet<>();
    }

    public void addSponsor(Sponsor sponsor) {
        if (sponsors.contains(sponsor)) {
            throw new RuntimeException("Давайте, без повторений!");
        }
        sponsors.add(sponsor);
    }

    @Override
    public String toString() {
        return "CheckingSponsor{" +
                "sponsors=" + sponsors +
                '}';
    }
}
