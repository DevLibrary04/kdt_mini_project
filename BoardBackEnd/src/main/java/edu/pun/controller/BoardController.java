package edu.pun.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.pun.domain.Board;
import edu.pun.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
public class BoardController {

	private final BoardService boardService;
	
	@GetMapping("/board")
	public ResponseEntity<?> getboard() {
		log.info("getBoard: All");
		return ResponseEntity.ok(boardService.getBoards());
	}
	
	@GetMapping("/board/{id}")
	public ResponseEntity<?> getBoard(@PathVariable Long id) {
		log.info("getBoard: " + id);
		return ResponseEntity.ok(boardService.getBoard(id));
	}
	
	@PostMapping("/board")
	public ResponseEntity<Board> addBoardItem(@RequestBody Board board) {
		return ResponseEntity.ok(boardService.addBoard(board));
	}
	
	@PutMapping("/board")
	public ResponseEntity<Board> updateBoardItem(@RequestBody Board board) {
		return ResponseEntity.ok(boardService.updateBoard(board));
	}
	
	@DeleteMapping("/board/{id}")
	public ResponseEntity<Board> deleteBoardItem(@PathVariable Long id) {
		return ResponseEntity.ok(boardService.deleteBoard(id));
	}
}
