package com.ipl.repository;

import com.ipl.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface TeamRepository extends CrudRepository<Team, Long> {
  Team findByTeamName(String teamName);
}
