#!/usr/bin/env python
"""mapper.py"""

import sys
import datetime

# input comes from STDIN (standard input)
for line in sys.stdin:
    # remove leading and trailing whitespace
    line = line.strip()
    
    # extract record time
    words = line.split("[")
    if len(words) > 1:
        record_time = words[1].split()
    else:
        continue
    
    # change time format
    formated_record_time = datetime.datetime.strptime(record_time[0], "%d/%b/%Y:%H:%M:%S")
    print (formated_record_time.strftime('%Y-%m-%d T %H:00:00.000')+"\t1")
