package com.onerep.repos;


import com.onerep.conainers.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepo extends JpaRepository<UserData, Integer> {
    public Collection<UserData> findAllByGender(String genderMaleOrFemale);
}
