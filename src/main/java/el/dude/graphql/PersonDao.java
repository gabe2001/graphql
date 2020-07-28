package el.dude.graphql;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * (C) Copyright 2020 Hewlett Packard Enterprise Development LP
 *
 * @author Gabriel Inäbnit - 2020-07-17
 */
public class PersonDao
{
	private List<Person> persons;

	public PersonDao(List<Person> persons)
	{
		this.persons = persons;
	}

	public Person getOldestPerson()
	{
		return persons.stream().max(Comparator.comparing(Person::getAge)).orElseThrow(NoSuchElementException::new);
	}

	public Person getYoungestPerson()
	{
		return persons.stream().min(Comparator.comparing(Person::getAge)).orElseThrow(NoSuchElementException::new);
	}

	public List<Person> list()
	{
		return persons;
	}

	public List<Person> listByAge(int age)
	{
		return persons.stream().filter(p -> p.getAge() == age).collect(Collectors.toUnmodifiableList());
	}

	public void addPerson(Person person)
	{
		persons.add(0, person);
	}
}
