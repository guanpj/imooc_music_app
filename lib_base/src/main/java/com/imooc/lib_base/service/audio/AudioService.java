package com.imooc.lib_base.service.audio;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * 音频基本础对外接口
 */
public interface AudioService extends IProvider {
    void pauseAudio();

    void resumeAudio();
}
