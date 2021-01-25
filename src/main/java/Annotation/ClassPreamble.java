package Annotation;

import java.lang.annotation.Repeatable;

public @interface ClassPreamble {
    String author();

    String date();

    int currentRevision() default 1;

    String lastModified() default "N/A";

    String lastModifiedBy() default "N/A";

    String[] reviewers();
}

@interface Schedule {
    String dayOfMonth() default "first";

    String dayOfWeek() default "Mon";

    int hour() default 12;
}