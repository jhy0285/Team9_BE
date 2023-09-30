package com.kakao.linknamu.bookmarkTag.service;

import com.kakao.linknamu.bookmarkTag.repository.BookmarkTagJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class BookmarkTagSearchService {
    private final BookmarkTagJPARepository bookmarkTagJPARepository;

    public List<String> searchNamesByBookmarkId(Long bookmarkId) {
        return bookmarkTagJPARepository.findTagNamesByBookmarkId(bookmarkId);
    }

    public Long searchTagIdByBookmarkId(Long bookmarkId) {
        return bookmarkTagJPARepository.findTagIdByBookmarkId(bookmarkId);
    }
}
