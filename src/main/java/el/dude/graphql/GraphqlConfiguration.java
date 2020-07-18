package el.dude.graphql;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * (C) Copyright 2020 Hewlett Packard Enterprise Development LP
 *
 * @author Gabriel Inäbnit - 2020-07-17
 */
@Configuration
public class GraphqlConfiguration
{
	@Bean
	public PersonDao personDao()
	{
		List<Person> persons = new ArrayList<>();
		return new PersonDao(persons);
	}

	@Bean
	public Query query(PersonDao personDao)
	{
		return new Query(personDao);
	}

	@Bean
	public Mutation mutation(PersonDao personDao)
	{
		return new Mutation(personDao);
	}


}
