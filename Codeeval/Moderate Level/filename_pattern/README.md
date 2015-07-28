#Filename Pattern#

###Challenge Description:###

You are given a filename pattern and a list of filenames. Find out which filenames from the list are matching the given pattern. The pattern can contain characters and the following wildcards:

*    ? — matches any single character.
*     — matches everything (any multiple characters, any single character, or empty string).
*    [abc] — matches any character inside brackets (in this example: a, b, or c).

Matching is case-sensitive.
###Input sample:###

The first argument is a file that contains space-separated filename pattern and filenames.

For example: 
```
*7* johab.py gen_probe.ko palmtx.h macpath.py tzp dm-dirty-log.h bh1770.h pktloc faillog.8.gz zconf.gperf
*[0123456789]*[auoei]* IBM1008_420.so zfgrep limits.conf.5.gz tc.h ilogb.3.gz limits.conf CyrAsia-TerminusBold28x14.psf.gz nf_conntrack_sip.ko DistUpgradeViewNonInteractive.pyc NFKDQC
*.??? max_user_watches arptables.h net_namespace Kannada.pl menu_no_no.utf-8.vim shtags.1 unistd_32_ia32.h gettext-tools.mo ntpdate.md5sums linkat.2.gz
*.pdf OldItali.pl term.log plymouth-upstart-bridge rand.so libipw.ko jisfreq.pyc impedance-analyzer xmon.h 1.5.0.3.txt bank
g*.* 56b8a0b6.0 sl.vim digctl.h groff-base.conffiles python-software-properties.md5sums CountryInformation.py use_zero_page session-noninteractive d2i_RSAPublicKey.3ssl.gz container-detect.log.4.gz
*[0123456789]* keyboard.h machinecheck 46b2fd3b.0 libip6t_frag.so timer_defs.h nano-menu.xpm NI vim-keys.conf setjmp.h memcg
```
###Output sample:###

Print filenames matching a given pattern to stdout. If there are no such files, print a minus ‘-’ character.

For example: 
```
bh1770.h
IBM1008_420.so
menu_no_no.utf-8.vim
-
groff-base.conffiles
46b2fd3b.0 libip6t_frag.so
```
###Constraints:###

1.    Matching is case-sensitive.
2.    Filenames cannot contain spaces.
3.    There are 40 test cases and 100 filenames in every test case.
