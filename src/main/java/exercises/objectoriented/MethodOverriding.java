package exercises.objectoriented;

public class MethodOverriding {

    class Sports {

        String getName() {
            return "Generic Sports";
        }

        void getNumberOfTeamMembers() {
            System.out.println("Each team has n players in " + getName());
        }
    }

    class Soccer extends Sports {
        @Override
        String getName() {
            return "Soccer Class";
        }

        @Override
        void getNumberOfTeamMembers() {
            System.out.println("Each team has 11 players in " + getName());
        }
    }

    public void solve() {
        // Given Code

        Sports c1 = new Sports();
        Soccer c2 = new Soccer();

        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();

        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}
