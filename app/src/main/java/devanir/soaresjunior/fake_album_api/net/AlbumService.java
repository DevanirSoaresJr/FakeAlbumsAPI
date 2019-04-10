package devanir.soaresjunior.fake_album_api.ui;

import java.util.List;

import devanir.soaresjunior.fake_album_api.AlbumResponse;
import io.reactivex.Maybe;
import retrofit2.http.GET;

import static devanir.soaresjunior.fake_album_api.Constants.ENDPOINT;

public interface AlbumService {
    @GET(ENDPOINT)
    Maybe<List<AlbumResponse>>getAlbumResults();
}
