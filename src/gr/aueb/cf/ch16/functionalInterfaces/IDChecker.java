package gr.aueb.cf.ch16.functionalInterfaces;

public interface IDChecker {

    /**
     * Checks for specific student ids.
     *
     * @param student
     *             Student class Instance
     * @return
     *          True when the id of the student is valid based on the predicate
     *          Otherwise false.
     */
    boolean checkId(Student student); // predicate

}
