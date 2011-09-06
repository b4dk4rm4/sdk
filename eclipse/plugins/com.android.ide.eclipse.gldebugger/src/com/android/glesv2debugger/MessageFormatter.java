/*
 ** Copyright 2011, The Android Open Source Project
 **
 ** Licensed under the Apache License, Version 2.0 (the "License");
 ** you may not use this file except in compliance with the License.
 ** You may obtain a copy of the License at
 **
 **     http://www.apache.org/licenses/LICENSE-2.0
 **
 ** Unless required by applicable law or agreed to in writing, software
 ** distributed under the License is distributed on an "AS IS" BASIS,
 ** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ** See the License for the specific language governing permissions and
 ** limitations under the License.
 */

// auto generated by generate_MessageFormatter_java.py"

package com.android.glesv2debugger;

import java.nio.ByteBuffer;

public class MessageFormatter {

    static String FormatFloats(int count, final ByteBuffer data) {
        if (data.remaining() == 0)
            return "[null]";
        data.order(SampleView.targetByteOrder);
        String ret = "[";
        for (int i = 0; i < count; i++) {
            ret += Float.intBitsToFloat(data.getInt());
            if (i < count - 1)
                ret += ", ";
        }
        return ret + "]";
    }
    
    static String FormatInts(int count, final ByteBuffer data) {
        if (data.remaining() == 0)
            return "[null]";
        data.order(SampleView.targetByteOrder);
        String ret = "[";
        for (int i = 0; i < count; i++) {
            ret += data.getInt();
            if (i < count - 1)
                ret += ", ";
        }
        return ret + "]";
    }
    
    static String FormatUints(int count, final ByteBuffer data) {
        if (data.remaining() == 0)
            return "[null]";
        data.order(SampleView.targetByteOrder);
        String ret = "[";
        for (int i = 0; i < count; i++) {
            long bits = data.getInt() & 0xffffffff;
            ret += bits;
            if (i < count - 1)
                ret += ", ";
        }
        return ret + "]";
    }
    
    static String FormatMatrix(int columns, int count, final ByteBuffer data) {
        if (data.remaining() == 0)
            return "[null]";
        data.order(SampleView.targetByteOrder);
        String ret = "[";
        for (int i = 0; i < count; i++) {
            ret += Float.intBitsToFloat(data.getInt());
            if (i % columns == columns - 1)
                ret += "\n                                             ";
            else if (i < count - 1)
                ret += ", ";
        }
        return ret + "]";
    }

    public static String Format(final DebuggerMessage.Message msg) {
        String str;
        switch (msg.getFunction()) {
            case glActiveTexture:
                str = String.format("%s (texture=%s)", "void", GLEnum.valueOf(msg.getArg0())); break;
            case glAttachShader:
                str = String.format("%s (program=%s, shader=%s)", "void", msg.getArg0(), msg.getArg1()); break;
            case glBindAttribLocation:
                str = String.format("%s (program=%s, index=%s, name=%s)", "void", msg.getArg0(), msg.getArg1(), msg.getData().toStringUtf8()); break;
            case glBindBuffer:
                str = String.format("%s (target=%s, buffer=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1()); break;
            case glBindFramebuffer:
                str = String.format("%s (target=%s, framebuffer=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1()); break;
            case glBindRenderbuffer:
                str = String.format("%s (target=%s, renderbuffer=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1()); break;
            case glBindTexture:
                str = String.format("%s (target=%s, texture=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1()); break;
            case glBlendColor:
                str = String.format("%s (red=%s, green=%s, blue=%s, alpha=%s)", "void", Float.intBitsToFloat(msg.getArg0()), Float.intBitsToFloat(msg.getArg1()), Float.intBitsToFloat(msg.getArg2()), Float.intBitsToFloat(msg.getArg3())); break;
            case glBlendEquation:
                str = String.format("%s (mode=%s)", "void", GLEnum.valueOf(msg.getArg0())); break;
            case glBlendEquationSeparate:
                str = String.format("%s (modeRGB=%s, modeAlpha=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1())); break;
            case glBlendFunc:
                str = String.format("%s (sfactor=%s, dfactor=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1())); break;
            case glBlendFuncSeparate:
                str = String.format("%s (srcRGB=%s, dstRGB=%s, srcAlpha=%s, dstAlpha=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), GLEnum.valueOf(msg.getArg2()), GLEnum.valueOf(msg.getArg3())); break;
            case glBufferData:
                str = String.format("%s (target=%s, size=%s, data=%s, usage=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1(), "0x" + Integer.toHexString(msg.getArg2()), GLEnum.valueOf(msg.getArg3())); break;
            case glBufferSubData:
                str = String.format("%s (target=%s, offset=%s, size=%s, data=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1(), msg.getArg2(), "0x" + Integer.toHexString(msg.getArg3())); break;
            case glCheckFramebufferStatus:
                str = String.format("%s (target=%s)", GLEnum.valueOf(msg.getRet()), GLEnum.valueOf(msg.getArg0())); break;
            case glClear:
                str = String.format("%s (mask=%s)", "void", msg.getArg0()); break;
            case glClearColor:
                str = String.format("%s (red=%s, green=%s, blue=%s, alpha=%s)", "void", Float.intBitsToFloat(msg.getArg0()), Float.intBitsToFloat(msg.getArg1()), Float.intBitsToFloat(msg.getArg2()), Float.intBitsToFloat(msg.getArg3())); break;
            case glClearDepthf:
                str = String.format("%s (depth=%s)", "void", Float.intBitsToFloat(msg.getArg0())); break;
            case glClearStencil:
                str = String.format("%s (s=%s)", "void", msg.getArg0()); break;
            case glColorMask:
                str = String.format("%s (red=%s, green=%s, blue=%s, alpha=%s)", "void", msg.getArg0(), msg.getArg1(), msg.getArg2(), msg.getArg3()); break;
            case glCompileShader:
                str = String.format("%s (shader=%s)", "void", msg.getArg0()); break;
            case glCompressedTexImage2D:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (target=%s, level=%s, internalformat=%s, width=%s, height=%s, border=%s, imageSize=%s, data=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1(), GLEnum.valueOf(msg.getArg2()), msg.getArg3(), msg.getArg4(), msg.getArg5(), msg.getArg6(), "0x" + Integer.toHexString(msg.getArg7())); break;
            case glCompressedTexSubImage2D:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (target=%s, level=%s, xoffset=%s, yoffset=%s, width=%s, height=%s, format=%s, imageSize=%s, data=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1(), msg.getArg2(), msg.getArg3(), msg.getArg4(), msg.getArg5(), GLEnum.valueOf(msg.getArg6()), msg.getArg7(), "0x" + Integer.toHexString(msg.getArg8())); break;
            case glCopyTexImage2D:
                str = String.format("%s (target=%s, level=%s, internalformat=%s, x=%s, y=%s, width=%s, height=%s, border=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1(), GLEnum.valueOf(msg.getArg2()), msg.getArg3(), msg.getArg4(), msg.getArg5(), msg.getArg6(), msg.getArg7()); break;
            case glCopyTexSubImage2D:
                str = String.format("%s (target=%s, level=%s, xoffset=%s, yoffset=%s, x=%s, y=%s, width=%s, height=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1(), msg.getArg2(), msg.getArg3(), msg.getArg4(), msg.getArg5(), msg.getArg6(), msg.getArg7()); break;
            case glCreateProgram:
                str = String.format("%s ()", msg.getRet()); break;
            case glCreateShader:
                str = String.format("%s (type=%s)", msg.getRet(), GLEnum.valueOf(msg.getArg0())); break;
            case glCullFace:
                str = String.format("%s (mode=%s)", "void", GLEnum.valueOf(msg.getArg0())); break;
            case glDeleteBuffers:
                str = String.format("%s (n=%s, buffers=%s)", "void", msg.getArg0(), FormatUints(1 * msg.getArg0(), msg.getData().asReadOnlyByteBuffer())); break;
            case glDeleteFramebuffers:
                str = String.format("%s (n=%s, framebuffers=%s)", "void", msg.getArg0(), FormatUints(1 * msg.getArg0(), msg.getData().asReadOnlyByteBuffer())); break;
            case glDeleteProgram:
                str = String.format("%s (program=%s)", "void", msg.getArg0()); break;
            case glDeleteRenderbuffers:
                str = String.format("%s (n=%s, renderbuffers=%s)", "void", msg.getArg0(), FormatUints(1 * msg.getArg0(), msg.getData().asReadOnlyByteBuffer())); break;
            case glDeleteShader:
                str = String.format("%s (shader=%s)", "void", msg.getArg0()); break;
            case glDeleteTextures:
                str = String.format("%s (n=%s, textures=%s)", "void", msg.getArg0(), FormatUints(1 * msg.getArg0(), msg.getData().asReadOnlyByteBuffer())); break;
            case glDepthFunc:
                str = String.format("%s (func=%s)", "void", GLEnum.valueOf(msg.getArg0())); break;
            case glDepthMask:
                str = String.format("%s (flag=%s)", "void", msg.getArg0()); break;
            case glDepthRangef:
                str = String.format("%s (zNear=%s, zFar=%s)", "void", Float.intBitsToFloat(msg.getArg0()), Float.intBitsToFloat(msg.getArg1())); break;
            case glDetachShader:
                str = String.format("%s (program=%s, shader=%s)", "void", msg.getArg0(), msg.getArg1()); break;
            case glDisable:
                str = String.format("%s (cap=%s)", "void", GLEnum.valueOf(msg.getArg0())); break;
            case glDisableVertexAttribArray:
                str = String.format("%s (index=%s)", "void", msg.getArg0()); break;
            case glDrawArrays:
                str = String.format("%s (mode=%s, first=%s, count=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1(), msg.getArg2()); break;
            case glDrawElements:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (mode=%s, count=%s, type=%s, indices=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1(), GLEnum.valueOf(msg.getArg2()), "0x" + Integer.toHexString(msg.getArg3())); break;
            case glEnable:
                str = String.format("%s (cap=%s)", "void", GLEnum.valueOf(msg.getArg0())); break;
            case glEnableVertexAttribArray:
                str = String.format("%s (index=%s)", "void", msg.getArg0()); break;
            case glFinish:
                str = String.format("%s ()", "void"); break;
            case glFlush:
                str = String.format("%s ()", "void"); break;
            case glFramebufferRenderbuffer:
                str = String.format("%s (target=%s, attachment=%s, renderbuffertarget=%s, renderbuffer=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), GLEnum.valueOf(msg.getArg2()), msg.getArg3()); break;
            case glFramebufferTexture2D:
                str = String.format("%s (target=%s, attachment=%s, textarget=%s, texture=%s, level=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), GLEnum.valueOf(msg.getArg2()), msg.getArg3(), msg.getArg4()); break;
            case glFrontFace:
                str = String.format("%s (mode=%s)", "void", GLEnum.valueOf(msg.getArg0())); break;
            case glGenBuffers:
                str = String.format("%s (n=%s, buffers=%s)", "void", msg.getArg0(), FormatUints(1 * msg.getArg0(), msg.getData().asReadOnlyByteBuffer())); break;
            case glGenerateMipmap:
                str = String.format("%s (target=%s)", "void", GLEnum.valueOf(msg.getArg0())); break;
            case glGenFramebuffers:
                str = String.format("%s (n=%s, framebuffers=%s)", "void", msg.getArg0(), FormatUints(1 * msg.getArg0(), msg.getData().asReadOnlyByteBuffer())); break;
            case glGenRenderbuffers:
                str = String.format("%s (n=%s, renderbuffers=%s)", "void", msg.getArg0(), FormatUints(1 * msg.getArg0(), msg.getData().asReadOnlyByteBuffer())); break;
            case glGenTextures:
                str = String.format("%s (n=%s, textures=%s)", "void", msg.getArg0(), FormatUints(1 * msg.getArg0(), msg.getData().asReadOnlyByteBuffer())); break;
            case glGetActiveAttrib:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (program=%s, index=%s, bufsize=%s, length=%s, size=%s, type=%s, name=%s)", "void", msg.getArg0(), msg.getArg1(), msg.getArg2(), "0x" + Integer.toHexString(msg.getArg3()), "0x" + Integer.toHexString(msg.getArg4()), "0x" + Integer.toHexString(msg.getArg5()), msg.getData().toStringUtf8()); break;
            case glGetActiveUniform:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (program=%s, index=%s, bufsize=%s, length=%s, size=%s, type=%s, name=%s)", "void", msg.getArg0(), msg.getArg1(), msg.getArg2(), "0x" + Integer.toHexString(msg.getArg3()), "0x" + Integer.toHexString(msg.getArg4()), "0x" + Integer.toHexString(msg.getArg5()), msg.getData().toStringUtf8()); break;
            case glGetAttachedShaders:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (program=%s, maxcount=%s, count=%s, shaders=%s)", "void", msg.getArg0(), msg.getArg1(), "0x" + Integer.toHexString(msg.getArg2()), "0x" + Integer.toHexString(msg.getArg3())); break;
            case glGetAttribLocation:
                str = String.format("%s (program=%s, name=%s)", msg.getRet(), msg.getArg0(), msg.getData().toStringUtf8()); break;
            case glGetBooleanv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (pname=%s, params=%s)", "void", GLEnum.valueOf(msg.getArg0()), "0x" + Integer.toHexString(msg.getArg1())); break;
            case glGetBufferParameteriv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (target=%s, pname=%s, params=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), "0x" + Integer.toHexString(msg.getArg2())); break;
            case glGetError:
                str = String.format("%s ()", GLEnum.valueOf(msg.getRet())); break;
            case glGetFloatv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (pname=%s, params=%s)", "void", GLEnum.valueOf(msg.getArg0()), "0x" + Integer.toHexString(msg.getArg1())); break;
            case glGetFramebufferAttachmentParameteriv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (target=%s, attachment=%s, pname=%s, params=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), GLEnum.valueOf(msg.getArg2()), "0x" + Integer.toHexString(msg.getArg3())); break;
            case glGetIntegerv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (pname=%s, params=%s)", "void", GLEnum.valueOf(msg.getArg0()), "0x" + Integer.toHexString(msg.getArg1())); break;
            case glGetProgramiv:
                str = String.format("%s (program=%s, pname=%s, params=%s)", "void", msg.getArg0(), GLEnum.valueOf(msg.getArg1()), FormatInts(1, msg.getData().asReadOnlyByteBuffer())); break;
            case glGetProgramInfoLog:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (program=%s, bufsize=%s, length=%s, infolog=%s)", "void", msg.getArg0(), msg.getArg1(), "0x" + Integer.toHexString(msg.getArg2()), msg.getData().toStringUtf8()); break;
            case glGetRenderbufferParameteriv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (target=%s, pname=%s, params=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), "0x" + Integer.toHexString(msg.getArg2())); break;
            case glGetShaderiv:
                str = String.format("%s (shader=%s, pname=%s, params=%s)", "void", msg.getArg0(), GLEnum.valueOf(msg.getArg1()), FormatInts(1, msg.getData().asReadOnlyByteBuffer())); break;
            case glGetShaderInfoLog:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (shader=%s, bufsize=%s, length=%s, infolog=%s)", "void", msg.getArg0(), msg.getArg1(), "0x" + Integer.toHexString(msg.getArg2()), msg.getData().toStringUtf8()); break;
            case glGetShaderPrecisionFormat:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (shadertype=%s, precisiontype=%s, range=%s, precision=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), "0x" + Integer.toHexString(msg.getArg2()), "0x" + Integer.toHexString(msg.getArg3())); break;
            case glGetShaderSource:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (shader=%s, bufsize=%s, length=%s, source=%s)", "void", msg.getArg0(), msg.getArg1(), "0x" + Integer.toHexString(msg.getArg2()), msg.getData().toStringUtf8()); break;
            case glGetString:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (name=%s)", "0x" + Integer.toHexString(msg.getRet()), GLEnum.valueOf(msg.getArg0())); break;
            case glGetTexParameterfv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (target=%s, pname=%s, params=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), "0x" + Integer.toHexString(msg.getArg2())); break;
            case glGetTexParameteriv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (target=%s, pname=%s, params=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), "0x" + Integer.toHexString(msg.getArg2())); break;
            case glGetUniformfv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (program=%s, location=%s, params=%s)", "void", msg.getArg0(), msg.getArg1(), "0x" + Integer.toHexString(msg.getArg2())); break;
            case glGetUniformiv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (program=%s, location=%s, params=%s)", "void", msg.getArg0(), msg.getArg1(), "0x" + Integer.toHexString(msg.getArg2())); break;
            case glGetUniformLocation:
                str = String.format("%s (program=%s, name=%s)", msg.getRet(), msg.getArg0(), msg.getData().toStringUtf8()); break;
            case glGetVertexAttribfv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (index=%s, pname=%s, params=%s)", "void", msg.getArg0(), GLEnum.valueOf(msg.getArg1()), "0x" + Integer.toHexString(msg.getArg2())); break;
            case glGetVertexAttribiv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (index=%s, pname=%s, params=%s)", "void", msg.getArg0(), GLEnum.valueOf(msg.getArg1()), "0x" + Integer.toHexString(msg.getArg2())); break;
            case glGetVertexAttribPointerv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (index=%s, pname=%s, pointer=%s)", "void", msg.getArg0(), GLEnum.valueOf(msg.getArg1()), "0x" + Integer.toHexString(msg.getArg2())); break;
            case glHint:
                str = String.format("%s (target=%s, mode=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1())); break;
            case glIsBuffer:
                str = String.format("%s (buffer=%s)", msg.getRet(), msg.getArg0()); break;
            case glIsEnabled:
                str = String.format("%s (cap=%s)", msg.getRet(), GLEnum.valueOf(msg.getArg0())); break;
            case glIsFramebuffer:
                str = String.format("%s (framebuffer=%s)", msg.getRet(), msg.getArg0()); break;
            case glIsProgram:
                str = String.format("%s (program=%s)", msg.getRet(), msg.getArg0()); break;
            case glIsRenderbuffer:
                str = String.format("%s (renderbuffer=%s)", msg.getRet(), msg.getArg0()); break;
            case glIsShader:
                str = String.format("%s (shader=%s)", msg.getRet(), msg.getArg0()); break;
            case glIsTexture:
                str = String.format("%s (texture=%s)", msg.getRet(), msg.getArg0()); break;
            case glLineWidth:
                str = String.format("%s (width=%s)", "void", Float.intBitsToFloat(msg.getArg0())); break;
            case glLinkProgram:
                str = String.format("%s (program=%s)", "void", msg.getArg0()); break;
            case glPixelStorei:
                str = String.format("%s (pname=%s, param=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1()); break;
            case glPolygonOffset:
                str = String.format("%s (factor=%s, units=%s)", "void", Float.intBitsToFloat(msg.getArg0()), Float.intBitsToFloat(msg.getArg1())); break;
            case glReadPixels:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (x=%s, y=%s, width=%s, height=%s, format=%s, type=%s, pixels=%s)", "void", msg.getArg0(), msg.getArg1(), msg.getArg2(), msg.getArg3(), GLEnum.valueOf(msg.getArg4()), GLEnum.valueOf(msg.getArg5()), "0x" + Integer.toHexString(msg.getArg6())); break;
            case glReleaseShaderCompiler:
                str = String.format("%s ()", "void"); break;
            case glRenderbufferStorage:
                str = String.format("%s (target=%s, internalformat=%s, width=%s, height=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), msg.getArg2(), msg.getArg3()); break;
            case glSampleCoverage:
                str = String.format("%s (value=%s, invert=%s)", "void", Float.intBitsToFloat(msg.getArg0()), msg.getArg1()); break;
            case glScissor:
                str = String.format("%s (x=%s, y=%s, width=%s, height=%s)", "void", msg.getArg0(), msg.getArg1(), msg.getArg2(), msg.getArg3()); break;
            case glShaderBinary:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (n=%s, shaders=%s, binaryformat=%s, binary=%s, length=%s)", "void", msg.getArg0(), "0x" + Integer.toHexString(msg.getArg1()), GLEnum.valueOf(msg.getArg2()), "0x" + Integer.toHexString(msg.getArg3()), msg.getArg4()); break;
            case glShaderSource:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (shader=%s, count=%s, string=%s, length=%s)", "void", msg.getArg0(), msg.getArg1(), "0x" + Integer.toHexString(msg.getArg2()), "0x" + Integer.toHexString(msg.getArg3())); break;
            case glStencilFunc:
                str = String.format("%s (func=%s, ref=%s, mask=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1(), msg.getArg2()); break;
            case glStencilFuncSeparate:
                str = String.format("%s (face=%s, func=%s, ref=%s, mask=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), msg.getArg2(), msg.getArg3()); break;
            case glStencilMask:
                str = String.format("%s (mask=%s)", "void", msg.getArg0()); break;
            case glStencilMaskSeparate:
                str = String.format("%s (face=%s, mask=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1()); break;
            case glStencilOp:
                str = String.format("%s (fail=%s, zfail=%s, zpass=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), GLEnum.valueOf(msg.getArg2())); break;
            case glStencilOpSeparate:
                str = String.format("%s (face=%s, fail=%s, zfail=%s, zpass=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), GLEnum.valueOf(msg.getArg2()), GLEnum.valueOf(msg.getArg3())); break;
            case glTexImage2D:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (target=%s, level=%s, internalformat=%s, width=%s, height=%s, border=%s, format=%s, type=%s, pixels=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1(), msg.getArg2(), msg.getArg3(), msg.getArg4(), msg.getArg5(), GLEnum.valueOf(msg.getArg6()), GLEnum.valueOf(msg.getArg7()), "0x" + Integer.toHexString(msg.getArg8())); break;
            case glTexParameterf:
                str = String.format("%s (target=%s, pname=%s, param=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), Float.intBitsToFloat(msg.getArg2())); break;
            case glTexParameterfv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (target=%s, pname=%s, params=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), "0x" + Integer.toHexString(msg.getArg2())); break;
            case glTexParameteri:
                str = String.format("%s (target=%s, pname=%s, param=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), msg.getArg2()); break;
            case glTexParameteriv:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (target=%s, pname=%s, params=%s)", "void", GLEnum.valueOf(msg.getArg0()), GLEnum.valueOf(msg.getArg1()), "0x" + Integer.toHexString(msg.getArg2())); break;
            case glTexSubImage2D:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (target=%s, level=%s, xoffset=%s, yoffset=%s, width=%s, height=%s, format=%s, type=%s, pixels=%s)", "void", GLEnum.valueOf(msg.getArg0()), msg.getArg1(), msg.getArg2(), msg.getArg3(), msg.getArg4(), msg.getArg5(), GLEnum.valueOf(msg.getArg6()), GLEnum.valueOf(msg.getArg7()), "0x" + Integer.toHexString(msg.getArg8())); break;
            case glUniform1f:
                str = String.format("%s (location=%s, x=%s)", "void", msg.getArg0(), Float.intBitsToFloat(msg.getArg1())); break;
            case glUniform1fv:
                str = String.format("%s (location=%s, count=%s, v=%s)", "void", msg.getArg0(), msg.getArg1(), FormatFloats(1 * msg.getArg1(), msg.getData().asReadOnlyByteBuffer())); break;
            case glUniform1i:
                str = String.format("%s (location=%s, x=%s)", "void", msg.getArg0(), msg.getArg1()); break;
            case glUniform1iv:
                str = String.format("%s (location=%s, count=%s, v=%s)", "void", msg.getArg0(), msg.getArg1(), FormatInts(1 * msg.getArg1(), msg.getData().asReadOnlyByteBuffer())); break;
            case glUniform2f:
                str = String.format("%s (location=%s, x=%s, y=%s)", "void", msg.getArg0(), Float.intBitsToFloat(msg.getArg1()), Float.intBitsToFloat(msg.getArg2())); break;
            case glUniform2fv:
                str = String.format("%s (location=%s, count=%s, v=%s)", "void", msg.getArg0(), msg.getArg1(), FormatFloats(2 * msg.getArg1(), msg.getData().asReadOnlyByteBuffer())); break;
            case glUniform2i:
                str = String.format("%s (location=%s, x=%s, y=%s)", "void", msg.getArg0(), msg.getArg1(), msg.getArg2()); break;
            case glUniform2iv:
                str = String.format("%s (location=%s, count=%s, v=%s)", "void", msg.getArg0(), msg.getArg1(), FormatInts(2 * msg.getArg1(), msg.getData().asReadOnlyByteBuffer())); break;
            case glUniform3f:
                str = String.format("%s (location=%s, x=%s, y=%s, z=%s)", "void", msg.getArg0(), Float.intBitsToFloat(msg.getArg1()), Float.intBitsToFloat(msg.getArg2()), Float.intBitsToFloat(msg.getArg3())); break;
            case glUniform3fv:
                str = String.format("%s (location=%s, count=%s, v=%s)", "void", msg.getArg0(), msg.getArg1(), FormatFloats(3 * msg.getArg1(), msg.getData().asReadOnlyByteBuffer())); break;
            case glUniform3i:
                str = String.format("%s (location=%s, x=%s, y=%s, z=%s)", "void", msg.getArg0(), msg.getArg1(), msg.getArg2(), msg.getArg3()); break;
            case glUniform3iv:
                str = String.format("%s (location=%s, count=%s, v=%s)", "void", msg.getArg0(), msg.getArg1(), FormatInts(3 * msg.getArg1(), msg.getData().asReadOnlyByteBuffer())); break;
            case glUniform4f:
                str = String.format("%s (location=%s, x=%s, y=%s, z=%s, w=%s)", "void", msg.getArg0(), Float.intBitsToFloat(msg.getArg1()), Float.intBitsToFloat(msg.getArg2()), Float.intBitsToFloat(msg.getArg3()), Float.intBitsToFloat(msg.getArg4())); break;
            case glUniform4fv:
                str = String.format("%s (location=%s, count=%s, v=%s)", "void", msg.getArg0(), msg.getArg1(), FormatFloats(4 * msg.getArg1(), msg.getData().asReadOnlyByteBuffer())); break;
            case glUniform4i:
                str = String.format("%s (location=%s, x=%s, y=%s, z=%s, w=%s)", "void", msg.getArg0(), msg.getArg1(), msg.getArg2(), msg.getArg3(), msg.getArg4()); break;
            case glUniform4iv:
                str = String.format("%s (location=%s, count=%s, v=%s)", "void", msg.getArg0(), msg.getArg1(), FormatInts(4 * msg.getArg1(), msg.getData().asReadOnlyByteBuffer())); break;
            case glUniformMatrix2fv:
                str = String.format("%s (location=%s, count=%s, transpose=%s, value=%s)", "void", msg.getArg0(), msg.getArg1(), msg.getArg2(), FormatMatrix(2, 4 * msg.getArg1(), msg.getData().asReadOnlyByteBuffer())); break;
            case glUniformMatrix3fv:
                str = String.format("%s (location=%s, count=%s, transpose=%s, value=%s)", "void", msg.getArg0(), msg.getArg1(), msg.getArg2(), FormatMatrix(3, 9 * msg.getArg1(), msg.getData().asReadOnlyByteBuffer())); break;
            case glUniformMatrix4fv:
                str = String.format("%s (location=%s, count=%s, transpose=%s, value=%s)", "void", msg.getArg0(), msg.getArg1(), msg.getArg2(), FormatMatrix(4, 16 * msg.getArg1(), msg.getData().asReadOnlyByteBuffer())); break;
            case glUseProgram:
                str = String.format("%s (program=%s)", "void", msg.getArg0()); break;
            case glValidateProgram:
                str = String.format("%s (program=%s)", "void", msg.getArg0()); break;
            case glVertexAttrib1f:
                str = String.format("%s (indx=%s, x=%s)", "void", msg.getArg0(), Float.intBitsToFloat(msg.getArg1())); break;
            case glVertexAttrib1fv:
                str = String.format("%s (indx=%s, values=%s)", "void", msg.getArg0(), FormatFloats(1, msg.getData().asReadOnlyByteBuffer())); break;
            case glVertexAttrib2f:
                str = String.format("%s (indx=%s, x=%s, y=%s)", "void", msg.getArg0(), Float.intBitsToFloat(msg.getArg1()), Float.intBitsToFloat(msg.getArg2())); break;
            case glVertexAttrib2fv:
                str = String.format("%s (indx=%s, values=%s)", "void", msg.getArg0(), FormatFloats(2, msg.getData().asReadOnlyByteBuffer())); break;
            case glVertexAttrib3f:
                str = String.format("%s (indx=%s, x=%s, y=%s, z=%s)", "void", msg.getArg0(), Float.intBitsToFloat(msg.getArg1()), Float.intBitsToFloat(msg.getArg2()), Float.intBitsToFloat(msg.getArg3())); break;
            case glVertexAttrib3fv:
                str = String.format("%s (indx=%s, values=%s)", "void", msg.getArg0(), FormatFloats(3, msg.getData().asReadOnlyByteBuffer())); break;
            case glVertexAttrib4f:
                str = String.format("%s (indx=%s, x=%s, y=%s, z=%s, w=%s)", "void", msg.getArg0(), Float.intBitsToFloat(msg.getArg1()), Float.intBitsToFloat(msg.getArg2()), Float.intBitsToFloat(msg.getArg3()), Float.intBitsToFloat(msg.getArg4())); break;
            case glVertexAttrib4fv:
                str = String.format("%s (indx=%s, values=%s)", "void", msg.getArg0(), FormatFloats(4, msg.getData().asReadOnlyByteBuffer())); break;
            case glVertexAttribPointer:
                // FIXME: this function uses pointers, debugger may send data in msg.data
                str = String.format("%s (indx=%s, size=%s, type=%s, normalized=%s, stride=%s, ptr=%s)", "void", msg.getArg0(), msg.getArg1(), GLEnum.valueOf(msg.getArg2()), msg.getArg3(), msg.getArg4(), "0x" + Integer.toHexString(msg.getArg5())); break;
            case glViewport:
                str = String.format("%s (x=%s, y=%s, width=%s, height=%s)", "void", msg.getArg0(), msg.getArg1(), msg.getArg2(), msg.getArg3()); break;
            default:
                str = msg.toString();
        }
        return str;
    }
}