package edu.pun.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pun.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
