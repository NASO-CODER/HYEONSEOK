package kr.co.softsoldesk.beans;

import java.util.List;

import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class ContentBean {

	private int content_idx;

	@NotBlank
	private String content_subject;

	@NotBlank
	private String content_text;

//	DB에 파일 이름을 담을 변수
	private String content_file;

	private String content_createdAt;

	private boolean content_isAnonymous;

	private List<String> content_hashTag;

	private int content_views;

	private int user_idx;

	private int board_info_idx;

//	----------------------------------------------------------- ↓↓ DB 테이블에 없는 변수들 (추가한 변수들) ↓↓

	private String content_writer_name; // 유저 테이블에 있는 작성자 이름

//	브라우저가 보낸 파일 데이터
	private MultipartFile upload_file;
//	파일을 올려보이면 여기서 해당 파일을 받고 경로를 지정한 후 content_file에다 주고 DB에 넘김
	
//	-----------------------------------------------------------
	
	public int getContent_idx() {
		return content_idx;
	}

	public void setContent_idx(int content_idx) {
		this.content_idx = content_idx;
	}

	public String getContent_subject() {
		return content_subject;
	}

	public void setContent_subject(String content_subject) {
		this.content_subject = content_subject;
	}

	public String getContent_text() {
		return content_text;
	}

	public void setContent_text(String content_text) {
		this.content_text = content_text;
	}

	public String getContent_file() {
		return content_file;
	}

	public void setContent_file(String content_file) {
		this.content_file = content_file;
	}

	public String getContent_createdAt() {
		return content_createdAt;
	}

	public void setContent_createdAt(String content_createdAt) {
		this.content_createdAt = content_createdAt;
	}

	public boolean isContent_isAnonymous() {
		return content_isAnonymous;
	}

	public void setContent_isAnonymous(boolean content_isAnonymous) {
		this.content_isAnonymous = content_isAnonymous;
	}

	public List<String> getContent_hashTag() {
		return content_hashTag;
	}

	public void setContent_hashTag(List<String> content_hashTag) {
		this.content_hashTag = content_hashTag;
	}

	public int getContent_views() {
		return content_views;
	}

	public void setContent_views(int content_views) {
		this.content_views = content_views;
	}

	public int getUser_idx() {
		return user_idx;
	}

	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}

	public int getBoard_info_idx() {
		return board_info_idx;
	}

	public void setBoard_info_idx(int board_info_idx) {
		this.board_info_idx = board_info_idx;
	}

	public String getContent_writer_name() {
		return content_writer_name;
	}

	public void setContent_writer_name(String content_writer_name) {
		this.content_writer_name = content_writer_name;
	}

	public MultipartFile getUpload_file() {
		return upload_file;
	}

	public void setUpload_file(MultipartFile upload_file) {
		this.upload_file = upload_file;
	}

}
