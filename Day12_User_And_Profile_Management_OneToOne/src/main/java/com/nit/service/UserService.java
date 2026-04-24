package com.nit.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nit.entity.User;
import com.nit.repo.ProfileRepository;
import com.nit.repo.UserRepository;

@Service
public class UserService implements IUserService {

    private final ProfileRepository profileRepository;
	
	@Autowired
	private UserRepository userRepository;

    UserService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }
	
//	@Autowired
//	private ProfileRepository profileRepository;

	@Override
	public void add(User user) 
	{		
		userRepository.save(user);
		
	}

	@Override
	public List<User> getDetails() {
		
		return userRepository.findAll();
	}

	@Override
	public void updateUser(Long id, User user)
	{
		Long id2 = userRepository.findById(id).get().getId();
		if(id2.equals(id))
			userRepository.save(user);
		else
			System.out.println(id+" Not Found!!!");
		
	}

	@Override
	public Optional<User> deleteUser(Long id) {
		Optional<User> byId = userRepository.findById(id);
		userRepository.delete(byId.get());
		return byId;
	}
	
	

}
