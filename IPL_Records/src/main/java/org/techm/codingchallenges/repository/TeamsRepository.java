package org.techm.codingchallenges.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.techm.codingchallenges.entity.Teams;
 
 
@Repository
public interface TeamsRepository extends JpaRepository<Teams, Integer>{
 
}
