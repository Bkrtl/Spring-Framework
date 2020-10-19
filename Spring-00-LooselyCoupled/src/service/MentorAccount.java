package service;

import implementation.Mentor;

public class MentorAccount {

    Mentor mentor;        // making a composition

    public MentorAccount(Mentor mentor) {    // creating a constructor
        this.mentor = mentor;
    }

    public void manageAccount(){      // create a method called manageAccount
        this.mentor.createAccount();
    }
}
