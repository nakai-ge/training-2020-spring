package example.training.model.fandamental.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
	code = HttpStatus.BAD_REQUEST,
	reason = "bad request"
)
public class ResourceNotFoundException extends RuntimeException{
	public ResourceNotFoundException() {
		super("ページが見つかりません。");
	}
}
