package transport;

import java.util.HashSet;
import java.util.Objects;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckingSponsor that = (CheckingSponsor) o;
        return Objects.equals(sponsors, that.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sponsors);
    }

    @Override
    public String toString() {
        return "CheckingSponsor{" +
                "sponsors=" + sponsors +
                '}';
    }
}
