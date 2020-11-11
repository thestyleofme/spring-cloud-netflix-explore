package com.github.thestyleofme.resume.service;

import com.github.thestyleofme.common.pojo.Resume;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/11/12 3:56
 * @since 1.0.0
 */
public interface ResumeService {

    /**
     * 根据用户id查询默认简历
     *
     * @param userId userId
     * @return Resume
     */
    Resume findDefaultResumeByUserId(Long userId);
}
