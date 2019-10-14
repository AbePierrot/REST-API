package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public  interface TopicRepository extends CrudRepository<Topic, String>   {

	//** dont need to implement this because curd repository contain the implementation details for crud operations
	// geAllTopics()
	// updateTopics(String id)
	// updateTopics(Topic t)
	// deleteTopics(String id)
}
