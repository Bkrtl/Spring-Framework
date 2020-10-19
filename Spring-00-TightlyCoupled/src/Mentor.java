public class Mentor {

    FullTimeMentor fullTimeMentor;      //composition
    PartTimeMentor partTimeMentor;      //composition

    public Mentor(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor) {  // creating a constructor
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMentor = partTimeMentor;
    }

    public void manageAccount(){               // creating a method
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
    }

    // 3 steps: 1- make a composition, 2- creating a constructor, 3- creating a method
}
