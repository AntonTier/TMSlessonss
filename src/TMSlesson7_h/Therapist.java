package TMSlesson7_h;

public class Therapist extends Doctor {

    public void treat() {

        System.out.println("Терапевт назначает лечение");

    }

    public void assignDoctor(Patient p) {

        switch (p.getTreatmentPlan()) {

            case 1:
                p.setDoctor(new Surgeon());
                break;

            case 2:
                p.setDoctor(new Dentist());
                break;

            default:
                p.setDoctor(new Therapist());
                break;

        }

        p.getDoctor().treat();
    }

}
