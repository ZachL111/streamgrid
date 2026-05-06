# Streamgrid Walkthrough

I use this file as a small checklist before changing the Java implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | schema drift | 257 | ship |
| stress | lineage depth | 224 | ship |
| edge | partition skew | 177 | ship |
| recovery | quality gap | 184 | ship |
| stale | schema drift | 144 | ship |

Start with `baseline` and `stale`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `stale` becomes less cautious without a clear reason, I would inspect the drag input first.
