package edu.pun.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.pun.domain.Board;
import edu.pun.persistence.BoardRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository boardRepo;
	
	public List<Board> getBoards() {
		return boardRepo.findAll();
	}
	
	public Board getBoard(Long id) {
		return boardRepo.findById(id).get();
	}
	
	public Board addBoard(Board board) {
		return boardRepo.save(board);
	}
	
	public Board updateBoard(Board board) {
		return boardRepo.save(board);
	}
	
	public Board deleteBoard(Long id) {
		Board findboard = boardRepo.findById(id).get();
		boardRepo.delete(findboard);
		return findboard;
	}
}
