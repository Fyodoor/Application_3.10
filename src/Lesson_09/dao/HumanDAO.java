package Lesson_09.dao;

public class HumanDAO implements DAO{

    Human people [] = new Human[5];
    @Override
    public Human create(Human human) {
        Human humanThatWeAreLookingFor = null;
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                people[i] = human;
                humanThatWeAreLookingFor = people[i];
                break;
            }
        }
        return humanThatWeAreLookingFor;
    }

    @Override
    public Human read(String name) {
        Human human = null;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equals(name)) {
                System.out.println(people[i].getName() + " " + people[i].getEmail());
                human = people[i];
                break;
            }
        }
        return human;
    }

    @Override
    public Human update(Human human) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals(human)) {
                people[i].setName(human.getName());
                people[i].setEmail(human.getEmail());
                break;
            }
        }
        return human;
    }

    @Override
    public void delete(Human human) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals(human)) {
                people[i] = null;
                break;
            }
        }
    }
}
