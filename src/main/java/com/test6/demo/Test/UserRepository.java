package com.test6.demo.Test;

import com.test6.demo.Topic.Topic;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, String> {

}
